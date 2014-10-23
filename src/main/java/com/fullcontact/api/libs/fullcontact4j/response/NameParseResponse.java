package com.fullcontact.api.libs.fullcontact4j.response;

public class NameParseResponse extends FCResponse {

    private String ambiguousName;
    private Result result;
    private String region;

    public String getAmbiguousName() {
        return ambiguousName;
    }

    public Result getResult() {
        return result;
    }

    public String getRegion() {
        return region;
    }

    public static class Result {
        private String givenName;
        private String familyName;
        private double likelihood;

        public String getGivenName() {
            return givenName;
        }

        public String getFamilyName() {
            return familyName;
        }

        public double getLikelihood() {
            return likelihood;
        }
    }
}
