import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassExample {

    /*
    Bắt đầu bằng một ký tự chữ hoa C hoặc A hoặc P

    Không chứa các ký tự đặc biệt

    Theo sau ký tự bắt đầu là 4 ký tự số

    Kết thúc phải là 1 trong những ký tự chữ hoa sau: G, H, I, K, L, M

    Ví dụ tên lớp hợp lệ: C0318G
     */

    private static final String CLASS_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public ClassExample() {
    }

    public boolean validate(String regex){
        Pattern p = Pattern.compile(CLASS_REGEX);
        Matcher m = p.matcher(regex);
        return m.matches();
    }
}
