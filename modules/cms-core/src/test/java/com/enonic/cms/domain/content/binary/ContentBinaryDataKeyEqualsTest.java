/*
 * Copyright 2000-2011 Enonic AS
 * http://www.enonic.com/license
 */
package com.enonic.cms.domain.content.binary;

import org.junit.Test;

import com.enonic.cms.domain.AbstractEqualsTest;


public class ContentBinaryDataKeyEqualsTest
    extends AbstractEqualsTest
{

    @Test
    public void testEquals()
    {
        assertEqualsContract();
    }

    public Object getObjectX()
    {
        return new ContentBinaryDataKey( 1 );
    }

    public Object[] getObjectsThatNotEqualsX()
    {
        return new Object[]{new ContentBinaryDataKey( 2 )};
    }

    public Object getObjectThatEqualsXButNotTheSame()
    {
        return new ContentBinaryDataKey( 1 );
    }

    public Object getObjectThatEqualsXButNotTheSame2()
    {
        return new ContentBinaryDataKey( 1 );
    }
}
