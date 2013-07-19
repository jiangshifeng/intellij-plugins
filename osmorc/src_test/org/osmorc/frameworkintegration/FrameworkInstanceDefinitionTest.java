package org.osmorc.frameworkintegration;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class FrameworkInstanceDefinitionTest {
  @Test
  public void comparison() throws Exception {
    assertEquals(define("Equinox", null), define("Equinox", null));
    assertFalse(define("Equinox", null).equals(define("Felix", null)));
    assertFalse(define("Equinox", "3.6").equals(define("Equinox", null)));
    assertFalse(define("Equinox", "3.6").equals(define("Equinox", "3.6.0")));
  }

  private static FrameworkInstanceDefinition define(@NotNull String name, @Nullable String version) {
    FrameworkInstanceDefinition definition = new FrameworkInstanceDefinition();
    definition.setName(name);
    definition.setVersion(version);
    return definition;
  }
}
