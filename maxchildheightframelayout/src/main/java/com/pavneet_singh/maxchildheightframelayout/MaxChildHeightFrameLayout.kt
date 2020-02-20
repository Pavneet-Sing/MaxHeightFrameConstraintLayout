package com.pavneet_singh.maxchildheightframelayout

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.widget.FrameLayout
import kotlin.math.max

/**
 * Created by Pavneet_Singh on 2020-02-19.
 */

class MaxChildHeightFrameLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private var maxHeight: Int = 0

    // required to support the minHeight attribute
    private var minHeight = attrs?.getAttributeValue(
        "http://schemas.android.com/apk/res/android",
        "minHeight"
    )?.substringBefore(".")?.toInt() ?: 0


    override fun getSuggestedMinimumHeight(): Int {
        var maxChildHeight = 0

        for (i in 0 until childCount) {
            maxChildHeight = max(maxChildHeight, getChildAt(i).measuredHeight)
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            minHeight = minimumHeight
        }

        if (maxHeight != 0 && layoutParams.height < (maxHeight - maxChildHeight) && maxHeight > maxChildHeight) {
            return if (maxHeight > minHeight) maxHeight else minHeight
        } else if (maxHeight == 0 || maxHeight < maxChildHeight) {
            maxHeight = maxChildHeight
        }

        return if (background == null) minHeight else max(
            minHeight,
            background.minimumHeight
        )
    }

}