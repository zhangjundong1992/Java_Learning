package lsn2_interact;

class SealClass {
    private int para = 0;

    int getPara() {
        return para;
    }

    void TestHierarchy( SealClass sc) {
        sc.para = 100;
    }
}
