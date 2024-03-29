public enum AssetStatus {
    NONE("NONE", "선택"),
    ACTIVE("ACTIVE","사용가능"),
    RENTAL("RENTAL", "대여중"),
    REPAIR("REPAIR", "수리중"),
    DISUSEINPROGRESS("DISUSEINPROGRESS", "폐기중"),
    DISUSE("DISUSE", "폐기");

    private String type;
    private String typeKor;

    AssetStatus(String type, String typeKor) {
        this.type= type;
        this.typeKor = typeKor;
    }


    public String getTypeKor() { return typeKor;}

    public String getType() { return type; }

    public String getValue() { return type; }
}
