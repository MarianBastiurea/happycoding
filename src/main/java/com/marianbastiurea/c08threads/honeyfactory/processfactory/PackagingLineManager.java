package com.marianbastiurea.c08threads.honeyfactory.processfactory;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

import java.util.EnumMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;

public class PackagingLineManager {

    private final Map<HoneyType, BlockingQueue<PackagingJob>> packagingQueues = new EnumMap<>(HoneyType.class);
    private final Map<HoneyType, ExecutorService> packagingExecutors = new EnumMap<>(HoneyType.class);
    private final Map<HoneyType, Double> finalStorage;

    public PackagingLineManager(Map<HoneyType, Double> finalStorage) {
        this.finalStorage = finalStorage;
        initializePackagingLines();
    }

    private void initializePackagingLines() {
        for (HoneyType type : HoneyType.values()) {
            BlockingQueue<PackagingJob> queue = new LinkedBlockingQueue<>();
            packagingQueues.put(type, queue);

            ExecutorService executor = Executors.newSingleThreadExecutor();
            packagingExecutors.put(type, executor);

            executor.submit(new PackagingWorker(type, queue, finalStorage));
        }
    }

    public Map<HoneyType, BlockingQueue<PackagingJob>> getPackagingQueues() {
        return packagingQueues;
    }

    public Map<HoneyType, ExecutorService> getPackagingExecutors() {
        return packagingExecutors;
    }
}