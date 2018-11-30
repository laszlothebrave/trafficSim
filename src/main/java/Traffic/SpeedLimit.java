package Traffic;

public final class SpeedLimit {
    final Integer  limitStartPoint;
    final Integer allowedSpeed;

    public SpeedLimit(Integer limitStartPoint, Integer allowedSpeed) {
        this.limitStartPoint = limitStartPoint;
        this.allowedSpeed = allowedSpeed;
    }
}
