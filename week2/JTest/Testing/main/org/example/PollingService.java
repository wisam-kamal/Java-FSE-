package org.example;

public class PollingService {
    private ExternalApi externalApi;

    public PollingService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public String[] pollThreeTimes() {
        return new String[]{
                externalApi.getData(),
                externalApi.getData(),
                externalApi.getData()
        };
    }
}
