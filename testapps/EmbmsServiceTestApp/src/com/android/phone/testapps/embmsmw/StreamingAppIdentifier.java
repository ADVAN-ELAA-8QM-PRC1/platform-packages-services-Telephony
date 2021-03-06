/*
 * Copyright (C) 2017 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.android.phone.testapps.embmsmw;

public class StreamingAppIdentifier {
    private final int uid;
    private final String appName;
    private final int subscriptionId;

    public StreamingAppIdentifier(int uid, String appName, int subscriptionId) {
        this.uid = uid;
        this.appName = appName;
        this.subscriptionId = subscriptionId;
    }

    public int getUid() {
        return uid;
    }

    public String getAppName() {
        return appName;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        StreamingAppIdentifier that = (StreamingAppIdentifier) o;

        if (uid != that.uid) {
            return false;
        }
        if (subscriptionId != that.subscriptionId) {
            return false;
        }
        return appName.equals(that.appName);
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + subscriptionId;
        return result;
    }
}
