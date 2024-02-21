public class RectangleArea implements Form {
    private float base;
    private float height;

    public RectangleArea(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculateAreaMethode() {
        return base * height;
    }
}
