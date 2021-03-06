package graphics.test.text;

public class GlyphOld {

    private final short w;
    private final short h;

    private final float u;
    private final float v;
    private final float u2;
    private final float v2;

    private int advance; // final

    public GlyphOld(int x, int y, short w, short h, int textureW, int textureH) {

        this.w = w;
        this.h = h;

        final float invImgWidth = 1f  / textureW;
        final float invImgHeight = 1f / textureH;
        final float fix = 0.001f;

        u  = (x + fix) * invImgWidth;
        u2 = (x + w - fix) * invImgWidth;
        v  = (y - h + fix) * invImgHeight;
        v2 = (y - fix) * invImgHeight;

    }


    public int w() { return w; }

    public int h() { return h; }

    public float u() { return u; }

    public float v() { return v; }

    public float u2() { return u2; }

    public float v2() { return v2; }

}
