package cc._9d77v.web.lib;

import lombok.Data;

@Data
public class L<T> {
    private int total;
    private T list;

    public L(int total, T list) {
        this.total = total;
        this.list = list;
    }
}
