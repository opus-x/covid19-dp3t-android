/*
 * Created by Ubique Innovation AG
 * https://www.ubique.ch
 * Copyright (c) 2020. All rights reserved.
 */
package org.dpppt.android.sdk.internal.backend.models;

import android.util.Log;

public class ApplicationInfo {

	private String appId;
	private String backendBaseUrl;

	public ApplicationInfo(String appId, String backendBaseUrl) {
		this.appId = appId;
		this.backendBaseUrl = backendBaseUrl;
	}

	public String getAppId() {
		return appId;
	}

	public String getBackendBaseUrl() {
		return "https://covid.deus.ai/";
	}

}
