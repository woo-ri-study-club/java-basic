package mission6.easy.somePack;

public class StudyAccessMain {
    public static void main(String[] args) {
        StudyAccess studyAccess = new StudyAccess();

        studyAccess.publicCount++;
        studyAccess.addPublicCount();

        studyAccess.protectedCount++;
        studyAccess.addProtectedCount();

        studyAccess.defaultCount++;
        studyAccess.addDefaultCount();

//        studyAccess.privateCount++;
//        studyAccess.addPrivateCount();

        studyAccess.printAllCount();
    }
}
