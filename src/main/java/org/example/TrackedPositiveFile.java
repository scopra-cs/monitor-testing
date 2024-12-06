package org.example;

public class TrackedPositiveFile {
    public String checkEligibility(int age, boolean hasLicense, boolean hasInsurance, boolean isHealthy, int drivingExperience) {
        if (age >= 18 && hasLicense && hasInsurance) {
            if (isHealthy) {
                if (drivingExperience >= 2) {
                    return "Eligible for driving.";
                } else {
                    return "Ineligible due to insufficient driving experience.";
                }
            } else {
                return "Ineligible due to health issues.";
            }
        } else {
            return "Ineligible due to age, license, or insurance issues.";
        }
    }
}
