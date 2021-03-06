package org.letustakearest.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * @author volodymyr.tsukur
 */
@Getter
@Setter
public final class City extends IdentifiableAndVersioned {

    private String name;

}
