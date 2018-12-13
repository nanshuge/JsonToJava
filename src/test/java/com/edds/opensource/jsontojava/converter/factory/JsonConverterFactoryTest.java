package com.edds.opensource.jsontojava.converter.factory;

import com.edds.opensource.jsontojava.converter.FileJsonConverter;
import com.edds.opensource.jsontojava.converter.JsonConverter;
import com.edds.opensource.jsontojava.converter.StringJsonConverter;
import org.junit.Assert;
import org.junit.Test;

public class JsonConverterFactoryTest {

    JsonConverterFactory factory = new JsonConverterFactory(null, null, null);

    @Test
    public void shouldReturnFileJsonConverterForParamHasExtension() {
        String param = "sdf/sdfds/sdf.json";
        JsonConverter converter = factory.createJsonConverter(param);

        Assert.assertTrue(converter instanceof FileJsonConverter);
    }

    @Test
    public void shouldReturnStringJsonConverterForParamHasNoExtension() {
        String param = "{}";
        JsonConverter converter = factory.createJsonConverter(param);

        Assert.assertTrue(converter instanceof StringJsonConverter);
    }
}