package com.wvt.mcbewiki.others;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

public class Algorithm {
    //复制到粘贴板
    public static void copyToClipboard(Context context, String text) {
        ClipboardManager systemService = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        systemService.setPrimaryClip(ClipData.newPlainText("ICMOD管理器", text));
    }
}
