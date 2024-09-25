package tek.tdd.api.models;

import lombok.Getter;

@Getter
public enum EndPoints {
    TOKEN("/api/token"),
    ADD_PRIMARY_ACCOUNT("/api/accounts/add-primary-account"),
    GET_PRIMARY_ACCOUNT("/api/accounts/get-primary-account"),
    GET_ACCOUNT("/api/accounts/get-account"),
    GET_ALL_PLAN_CODE("/api/plans/get-all-plan-code");

    private final String value;

    EndPoints(String value) {
        this.value = value;
    }
}