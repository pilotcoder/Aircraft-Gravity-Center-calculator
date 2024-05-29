package pl.gccalc;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Aircraft {


    private Double frontWeight;
    private Double rearWeight;

    private Double totalWeight;
    private Double leftWingWeight;
    private Double rightWingWeight;
    private Double tailplaneWeight;
    private Double fuselageWeight;
    private Double aLength;
    private Double lLength;
    private String weighingMethod;
    private Double gravityCentre;
    private Double gravityCentreRound;

    public void setTotalWeight(Double frontWeight, Double rearWeight) {
        this.totalWeight = frontWeight + rearWeight;
    }

    public void setFuselageWeight(Double totalWeight, Double leftWingWeight, Double rightWingWeight, Double tailplaneWeight) {
        this.fuselageWeight = totalWeight - leftWingWeight - rightWingWeight - tailplaneWeight;
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "frontWeight=" + frontWeight +
                ", rearWeight=" + rearWeight +
                ", totalWeight=" + totalWeight +
                ", leftWingWeight=" + leftWingWeight +
                ", rightWingWeight=" + rightWingWeight +
                ", tailplaneWeight=" + tailplaneWeight +
                ", fuselageWeight=" + fuselageWeight +
                ", aLength=" + aLength +
                ", lLength=" + lLength +
                ", gravityCentre=" + gravityCentre +
                ", gravityCentreRound=" + gravityCentreRound +
                '}';
    }

    public void setGravityCentre(Double gravityCentre) {

        this.gravityCentre = gravityCentre;
    }
}
