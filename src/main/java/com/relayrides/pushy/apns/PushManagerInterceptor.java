package com.relayrides.pushy.apns;

/**
 * Created by nsun on 16-1-5.
 */
public interface PushManagerInterceptor<T extends ApnsPushNotification> {

    boolean beforeSendNotification(T n);

}
