public class Practice {
    public static void main(String[] args) {
        for (AssetStatus value : AssetStatus.values()) {
            System.out.println(value);
            System.out.println(value.getClass().getName());

            System.out.println(value.getValue());
            System.out.println(value.getValue().getClass().getName());
        }
    }
}
