/*
 * Copyright 2000-2011 Enonic AS
 * http://www.enonic.com/license
 */
package com.enonic.cms.business.resolver.deviceclass;

import com.enonic.cms.business.resolver.AbstractXsltScriptResolver;

import com.enonic.cms.domain.resolver.ScriptResolverResult;

/**
 * Created by rmy - Date: Apr 14, 2009
 */
public class DeviceClassXsltScriptResolver
    extends AbstractXsltScriptResolver
{
    protected final static String RESOLVING_EXCEPTION_MSG = "Faild to resolve device class";

    public final static String DEVICE_CLASS_RETURN_VALUE_KEY = "deviceClassReturnValue";

    protected ScriptResolverResult populateScriptResolverResult( String resolvedValue )
    {
        ScriptResolverResult result = new ScriptResolverResult();
        result.getResolverReturnValues().put( DEVICE_CLASS_RETURN_VALUE_KEY, resolvedValue );

        return result;
    }
}
