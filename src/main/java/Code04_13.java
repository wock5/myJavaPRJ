public class Code04_13 {
    public static void main(String[] args) {
        String str = " 한글   abcd    efgh    ";
        String cutStr = "";
        String lower = "";
        String upper = "";
        String allStr = "";

        cutStr = str.trim();
        upper = str.toUpperCase();
        lower = str.toLowerCase();
        allStr = str.replaceAll(" ","");

        System.out.println("기존 문자열 ==> [" + str + "]");
        System.out.println("공백 제거 ==>[" + cutStr + "]");
        System.out.println("대문자 ==> ["+ upper +"]");
        System.out.println("소문자 ==> ["+ lower +"]");
        System.out.println("모든 공백 제거 ==> ["+ allStr +"]");
    }
}