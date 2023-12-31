package com.ssblur.lockbox.forge;

import com.ssblur.lockbox.LockboxExpectPlatform;
import net.minecraftforge.fml.loading.FMLPaths;

import java.nio.file.Path;

public class LockboxExpectPlatformImpl {
  /**
   * This is our actual method to {@link LockboxExpectPlatform#getConfigDirectory()}.
   */
  public static Path getConfigDirectory() {
    return FMLPaths.CONFIGDIR.get();
  }
}
