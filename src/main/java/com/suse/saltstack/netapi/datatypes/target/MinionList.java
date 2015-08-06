package com.suse.saltstack.netapi.datatypes.target;

import java.util.Arrays;
import java.util.List;

/**
 * Target for specifying a list of minions.
 */
public class MinionList implements Target<List<String>> {

    private final java.util.List<String> targets;

    /**
     * Constructor taking a list of minions as strings.
     *
     * @param targets as a list of strings
     */
    public MinionList(List<String> targets) {
        this.targets = targets;
    }

    /**
     * Constructor taking an optional list of strings.
     *
     * @param targets as strings
     */
    public MinionList(String... targets) {
        this(Arrays.asList(targets));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<String> target() {
        return targets;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String targetType() {
        return "list";
    }
}