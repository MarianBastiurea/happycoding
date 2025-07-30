package com.marianbastiurea.c08threads.honeyfactory.honey;

import com.marianbastiurea.c08threads.honeyfactory.enums.HoneyType;

import java.util.EnumMap;
import java.util.Map;

public class HoneyJarOrderFromStore {
    private final String storeName;
    private final Map<HoneyType, Integer> jarsToDeliver = new EnumMap<>(HoneyType.class);
    private final Map<HoneyType, Integer> delivered = new EnumMap<>(HoneyType.class);
    private final Map<HoneyType, Integer> inProcessing = new EnumMap<>(HoneyType.class);

    public HoneyJarOrderFromStore(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }

    public Map<HoneyType, Integer> getJarsToDeliver() {
        return jarsToDeliver;
    }

    public void addHoneyOrder(HoneyType honeyType, int numberOfJars) {
        jarsToDeliver.merge(honeyType, numberOfJars, Integer::sum);
    }

    public void incrementDelivered(HoneyType honeyType) {
        delivered.merge(honeyType, 1, Integer::sum);
    }

    public Map<HoneyType, Integer> getDeliveredMap() {
        return delivered;
    }

    public void computeInProcessing() {
        for (Map.Entry<HoneyType, Integer> entry : jarsToDeliver.entrySet()) {
            HoneyType type = entry.getKey();
            int ordered = entry.getValue();
            int deliveredSoFar = delivered.getOrDefault(type, 0);
            int remaining = ordered - deliveredSoFar;
            if (remaining > 0) {
                inProcessing.put(type, remaining);
            } else {
                inProcessing.put(type, 0);
            }
        }
    }

    public Map<HoneyType, Integer> getInProcessingMap() {
        return inProcessing;
    }

    public String summaryReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("📦 Order summary for store: ").append(storeName).append("\n");

        for (HoneyType type : jarsToDeliver.keySet()) {
            int ordered = jarsToDeliver.getOrDefault(type, 0);
            int deliveredCount = delivered.getOrDefault(type, 0);
            int inProgress = ordered - deliveredCount;

            if (inProgress <= 0) {
                sb.append(String.format("   ✅ %s: %d / %d jars delivered%n", type, deliveredCount, ordered));
            } else {
                sb.append(String.format("   ⚠️ %s: %d / %d jars delivered → %d still in processing%n",
                        type, deliveredCount, ordered, inProgress));
            }
        }
        return sb.toString();
    }
}
