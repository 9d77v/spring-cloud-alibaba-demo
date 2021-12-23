package cc._9d77v.web.lib;

public enum REnum {
    SUCCESS(0, "成功"),
    FAIL(-1, "失败");
    private int code;
    private String message;

    REnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}