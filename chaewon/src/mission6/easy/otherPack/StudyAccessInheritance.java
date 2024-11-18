package mission6.easy.otherPack;

import mission6.easy.somePack.StudyAccess;

public class StudyAccessInheritance extends StudyAccess {
    public StudyAccessInheritance() {
        super();

        this.publicCount++;
        this.addPublicCount();

        this.protectedCount++;
        this.addProtectedCount();

//        this.defaultCount++;
//        this.addDefaultCount();

//        this.privateCount++;
//        this.addPrivateCount();
    }
}
