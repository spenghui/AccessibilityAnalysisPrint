package com.example.AccessibilityAnalysisPrint;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

public class MyAccessibilityService extends AccessibilityService {

	@Override
	public void onAccessibilityEvent(AccessibilityEvent event) {
		// TODO Auto-generated method stub
		
		Log.d("AnalysisAppsEvent","-------------------------------------------------------------");
        int eventType = event.getEventType();//事件类型
        Log.d("AnalysisAppsEvent","packageName:" + event.getPackageName() + "");//响应事件的包名，也就是哪个应用才响应了这个事件
        Log.d("AnalysisAppsEvent","source:" + event.getSource() + "");//事件源信息
        Log.d("AnalysisAppsEvent","source class:" + event.getClassName() + "");//事件源的类名，比如android.widget.TextView
        Log.d("AnalysisAppsEvent","event type(int):" + eventType + "");

        switch (eventType) {
            case AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED:// 通知栏事件
                Log.d("AnalysisAppsEvent","event type:TYPE_NOTIFICATION_STATE_CHANGED");
                break;
            case AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED://窗体状态改变
                Log.d("AnalysisAppsEvent","event type:TYPE_WINDOW_STATE_CHANGED");
                break;
            case AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED://View获取到焦点
                Log.d("AnalysisAppsEvent","event type:TYPE_VIEW_ACCESSIBILITY_FOCUSED");
                break;
            case AccessibilityEvent.TYPE_GESTURE_DETECTION_START:
                Log.d("AnalysisAppsEvent","event type:TYPE_VIEW_ACCESSIBILITY_FOCUSED");
                break;
            case AccessibilityEvent.TYPE_GESTURE_DETECTION_END:
                Log.d("AnalysisAppsEvent","event type:TYPE_GESTURE_DETECTION_END");
                break;
            case AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED:
                Log.d("AnalysisAppsEvent","event type:TYPE_WINDOW_CONTENT_CHANGED");
                break;
            case AccessibilityEvent.TYPE_VIEW_CLICKED:
                Log.d("AnalysisAppsEvent","event type:TYPE_VIEW_CLICKED");
                break;
            case AccessibilityEvent.TYPE_VIEW_TEXT_CHANGED:
                Log.d("AnalysisAppsEvent","event type:TYPE_VIEW_TEXT_CHANGED");
                break;
            case AccessibilityEvent.TYPE_VIEW_SCROLLED:
                Log.d("AnalysisAppsEvent","event type:TYPE_VIEW_SCROLLED");
                break;
            case AccessibilityEvent.TYPE_VIEW_TEXT_SELECTION_CHANGED:
                Log.d("AnalysisAppsEvent","event type:TYPE_VIEW_TEXT_SELECTION_CHANGED");
                break;
        }

        for (CharSequence txt : event.getText()) {
            Log.d("AnalysisAppsEvent","text:" + txt);//输出当前事件包含的文本信息
        }

        Log.d("AnalysisAppsEvent","-------------------------------------------------------------");
	}

	@Override
	public void onInterrupt() {
		// TODO Auto-generated method stub

	}

}
