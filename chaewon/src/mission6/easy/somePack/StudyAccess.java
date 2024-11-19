package mission6.easy.somePack;

public class StudyAccess {
    public int publicCount;
    protected int protectedCount;
    int defaultCount;
    private int privateCount;

    public int addPublicCount() {
        return publicCount++;
    }

    protected int addProtectedCount() {
        return protectedCount++;
    }

    int addDefaultCount() {
        return defaultCount++;
    }

    private int addPrivateCount() {
        return privateCount++;
    }

    public void printAllCount(){
        System.out.println("publicCount = " + publicCount);
        System.out.println("protectedCount = " + protectedCount);
        System.out.println("defaultCount = " + defaultCount);
        System.out.println("privateCount = " + privateCount);
    }
}
