package com.liangbx.android.unit.test.practice;

import android.app.Activity;
import android.os.Build;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Author liangbx
 * Date 2017/2/27
 */
@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = Build.VERSION_CODES.LOLLIPOP)
public class MainActivityTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testTitle() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);
        Assert.assertTrue(activity.getTitle().toString().equals("Title"));
    }
}