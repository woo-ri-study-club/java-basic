package mission6.easy.otherPack;

import mission6.easy.somePack.StudyAccess;

public class StudyAccessOtherMain {
    public static void main(String[] args) {
        StudyAccess studyAccess = new StudyAccess();

        studyAccess.publicCount++;
        studyAccess.addPublicCount();

//        studyAccess.protectedCount++;
//        studyAccess.addProtectedCount();
//
//        studyAccess.defaultCount++;
//        studyAccess.addDefaultCount();

//        studyAccess.privateCount++;
//        studyAccess.addPrivateCount();

        studyAccess.printAllCount();
    }
}