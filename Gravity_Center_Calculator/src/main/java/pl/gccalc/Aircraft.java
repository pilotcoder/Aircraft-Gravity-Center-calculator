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
private Double aLength;
private Double lLength ;
private String weighingMethod ;
private Double gravityCentre ;

    @Override
    public String toString() {
        return "Aircraft{" +
                "frontWeight=" + frontWeight +
                ", rearWeight=" + rearWeight +
                ", aLength=" + aLength +
                ", lLength=" + lLength +
                 "\n" +
                ", Center of gravity position: = " + gravityCentre +
                "\n" +
                "Please check range of G.C. in Maintenance manual of your glider." +
                '}';
    }
}
