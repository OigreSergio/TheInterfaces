public class TriangleArea implements Form {
    private float base;
    private float height;

    public TriangleArea(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float calculateAreaMethode() {
        return base * height / 2;
    }
}
