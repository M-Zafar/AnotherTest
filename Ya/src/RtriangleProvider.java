/**
 * Created by Zafar Mahmudov on 20.09.2014.
 */
public final class RtriangleProvider implements  Rtriangle{
    public int getApexX1() {
        return 1; }
    public int getApexY1() { return 1; }
    public int getApexX2() { return 1; }
    public int getApexY2() { return 1; }
    public int getApexX3() { return 1; }
    public int getApexY3() { return 1; }

    public static Rtriangle getRtriangle () {
        return new Rtriangle() {
            @Override
            public int getApexX1() {
                return 1;
            }

            @Override
            public int getApexY1() {
                return 1;
            }

            @Override
            public int getApexX2() {
                return 1;
            }

            @Override
            public int getApexY2() {
                return 1;
            }

            @Override
            public int getApexX3() {
                return 1;
            }

            @Override
            public int getApexY3() {
                return 1;
            }
        };
    }

}
