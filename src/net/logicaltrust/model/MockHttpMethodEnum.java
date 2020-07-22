package net.logicaltrust.model;

public enum MockHttpMethodEnum {

    ANY("Any") {
        public boolean matches(String method) {
            return true;
        }
    },

    GET("GET") {
        public boolean matches(String method) {
            return "get".equalsIgnoreCase(method);
        }
    },

    HEAD("HEAD") {
        public boolean matches(String method) {
            return "head".equalsIgnoreCase(method);
        }
    },
    
    POST("POST") {
        public boolean matches(String method) {
            return "post".equalsIgnoreCase(method);
        }
    },

    PUT("PUT") {
        public boolean matches(String method) {
            return "put".equalsIgnoreCase(method);
        }
    },
    
    DELETE("DELETE") {
        public boolean matches(String method) {
            return "delete".equalsIgnoreCase(method);
        }
    },

    CONNECT("CONNECT") {
        public boolean matches(String method) {
            return "connect".equalsIgnoreCase(method);
        }
    },
    
    OPTIONS("OPTIONS") {
        public boolean matches(String method) {
            return "options".equalsIgnoreCase(method);
        }
    },

    TRACE("TRACE") {
        public boolean matches(String method) {
            return "trace".equalsIgnoreCase(method);
        }
    },

    PATCH("PATCH") {
        public boolean matches(String method) {
            return "patch".equalsIgnoreCase(method);
        }
    };

    private final String httpMethod;

    MockHttpMethodEnum(String method) {
        this.httpMethod = method;
    }

    public String getHttpMethod() {
        return httpMethod;
    }

    public abstract boolean matches(String method);

}
