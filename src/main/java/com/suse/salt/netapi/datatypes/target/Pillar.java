package com.suse.salt.netapi.datatypes.target;

/**
 * Matcher based on salt pillar with glob matching
 */
public class Pillar extends DictionaryTarget implements Target<String> {

    /**
     * Creates a pillar matcher
     *
     * @param target the targeting expression
     */
    public Pillar(String target) {
        super(target);
    }

    /**
     * Creates a pillar matcher
     *
     * @param target the targeting expression
     * @param delimiter the character to delimit nesting in the grain name
     */
    public Pillar(String target, char delimiter) {
        super(target, delimiter);
    }

    /**
     * Creates a pillar matcher
     *
     * @param pillar the pillar name
     * @param value the value to match
     */
    public Pillar(String pillar, String value) {
        super(pillar, value);
    }

    /**
     * Creates a pillar matcher
     *
     * @param pillar the pillar name
     * @param value the value to match
     * @param delimiter the character to delimit nesting in the pillar name
     */
    public Pillar(String pillar, String value, char delimiter) {
        super(pillar, value, delimiter);
    }

    @Override
    public TargetType getType() {
        return TargetType.PILLAR;
    }
}