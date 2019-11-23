/**
 * Created by student7 on 23.11.19.
 */
public class CombRatio extends Ratio{
    private int chel;

    public CombRatio(int chel) {
        this.chel = chel;
    }

    public CombRatio(int i, int j, int chel) {
        super(i, j);
        this.chel = chel;
    }

    public CombRatio Add(Ratio ratio){
        int top = toRatio(this).getTop() * ratio.getBottom() + toRatio(this).getBottom()*ratio.getTop();
        int bottom = toRatio(this).getBottom()*ratio.getBottom();
        int cel = top / bottom;
        return new CombRatio(cel, top%bottom, bottom);
    }
    public CombRatio Add(CombRatio ratio){
        int top = toRatio(this).getTop()*toRatio(ratio).getBottom()+ toRatio(this).getBottom()*toRatio(ratio).getTop();
    }
    private Ratio toRatio(CombRatio combRatio){
        return new Ratio(combRatio.getBottom() * chel + combRatio.getTop(), combRatio.getBottom());
    }
}
