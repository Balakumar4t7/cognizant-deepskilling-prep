public class ForCastingValue {
    public double findFutureValue(double presentValue,double growth, int years){
        if(years==0) {
            return presentValue;
        }
        return findFutureValue(presentValue * (1 + growth), growth,years-1);
    }
}
