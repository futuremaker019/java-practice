public class SubStringPractice {

    public static void main(String[] args) {

        String path = "D:\\dev\\workspace\\SIMMS_V3\\server\\ROOT\\js\\setting\\company\\companies.js";

        String substring = path.substring(path.lastIndexOf("js\\") + 3, path.lastIndexOf("\\")).replaceAll("\\\\", "/");

        System.out.println("substring = " + substring);
    }
}
