package com.konfigthis.client;

import com.konfigthis.client.api.ApplicationApi;
import com.konfigthis.client.api.AuthenticationApi;
import com.konfigthis.client.api.BackgroundTasksApi;
import com.konfigthis.client.api.EndpointApi;
import com.konfigthis.client.api.EventTypeApi;
import com.konfigthis.client.api.HealthApi;
import com.konfigthis.client.api.IntegrationApi;
import com.konfigthis.client.api.MessageApi;
import com.konfigthis.client.api.MessageAttemptApi;
import com.konfigthis.client.api.StatisticsApi;

public class Svix {
    private ApiClient apiClient;
    public final ApplicationApi application;
    public final AuthenticationApi authentication;
    public final BackgroundTasksApi backgroundTasks;
    public final EndpointApi endpoint;
    public final EventTypeApi eventType;
    public final HealthApi health;
    public final IntegrationApi integration;
    public final MessageApi message;
    public final MessageAttemptApi messageAttempt;
    public final StatisticsApi statistics;

    public Svix() {
        this(null);
    }

    public Svix(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.application = new ApplicationApi(this.apiClient);
        this.authentication = new AuthenticationApi(this.apiClient);
        this.backgroundTasks = new BackgroundTasksApi(this.apiClient);
        this.endpoint = new EndpointApi(this.apiClient);
        this.eventType = new EventTypeApi(this.apiClient);
        this.health = new HealthApi(this.apiClient);
        this.integration = new IntegrationApi(this.apiClient);
        this.message = new MessageApi(this.apiClient);
        this.messageAttempt = new MessageAttemptApi(this.apiClient);
        this.statistics = new StatisticsApi(this.apiClient);
    }

}
