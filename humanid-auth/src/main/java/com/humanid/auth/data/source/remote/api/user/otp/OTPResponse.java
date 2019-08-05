package com.humanid.auth.data.source.remote.api.user.otp;

import android.support.annotation.NonNull;
import android.text.TextUtils;

import com.google.gson.annotations.SerializedName;
import com.humanid.internal.Validate;

public class OTPResponse {

	@SerializedName("message")
	private String message;

	public OTPResponse() {
		// Default Constructor
	}

	public OTPResponse(@NonNull String message) {
		Validate.checkArgument(!TextUtils.isEmpty(message), "message");

		this.message = message;
	}

	@NonNull
	public String getMessage(){
		return message;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		OTPResponse that = (OTPResponse) o;
		return message.equals(that.message);
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = 31 * result + (message == null ? 0 : message.hashCode());

		return result;
	}

	@NonNull
	@Override
	public String toString() {
		return "OTPResponse{" +
				"message='" + message + '\'' +
				'}';
	}
}