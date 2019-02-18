package com.stfalcon.frescoimageviewer.imageformat;

import android.content.Context;

import com.facebook.drawee.backends.pipeline.DraweeConfig;
import com.facebook.imagepipeline.decoder.ImageDecoderConfig;

public class CustomImageFormatConfigurator {
    public static ImageDecoderConfig createImageDecoderConfig() {
        ImageDecoderConfig.Builder config = ImageDecoderConfig.newBuilder();

        config.addDecodingCapability(
                    SvgImageFormatter.SVG_FORMAT,
                    new SvgImageFormatter.SvgFormatChecker(),
                    new SvgImageFormatter.SvgDecoder());
        return config.build();
    }

    public static void addCustomDrawableFactories(
            DraweeConfig.Builder draweeConfigBuilder) {
            draweeConfigBuilder.addCustomDrawableFactory(new SvgImageFormatter.SvgDrawableFactory());
    }
}
