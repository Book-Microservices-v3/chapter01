import lombok.Value;

/** 
 * Represents a challenge with two factors.
 */
@Value
public class Challenge {
  // Both factors
  int factorA;
  int factorB;
}
