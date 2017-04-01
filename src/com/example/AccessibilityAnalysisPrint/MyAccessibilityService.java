package com.example.AccessibilityAnalysisPrint;

import android.accessibilityservice.AccessibilityService;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;

public class MyAccessibilityService extends AccessibilityService {

	@Override
	public void onAccessibilityEvent(AccessibilityEvent event) {
		// TODO Auto-generated method stub
		
		Log.d("AnalysisAppsEvent","-------------------------------------------------------------");
        int eventType = event.getEventType();//�¼�����
        Log.d("AnalysisAppsEvent","packageName:" + event.getPackageName() + "");//��Ӧ�¼��İ�����Ҳ�����ĸ�Ӧ�ò���Ӧ������¼�
        Log.d("AnalysisAppsEvent","source:" + event.getSource() + "");//�¼�Դ��Ϣ
        Log.d("AnalysisAppsEvent","source class:" + event.getClassName() + "");//�¼�Դ������������android.widget.TextView
        Log.d("AnalysisAppsEvent","event type(int):" + eventType + "");

        switch (eventType) {
            case AccessibilityEvent.TYPE_NOTIFICATION_STATE_CHANGED:// ֪ͨ���¼�
                Log.d("AnalysisAppsEvent","event type:TYPE_NOTIFICATION_STATE_CHANGED");
                break;
            case AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED://����״̬�ı�
                Log.d("AnalysisAppsEvent","event type:TYPE_WINDOW_STATE_CHANGED");
                break;
            case AccessibilityEvent.TYPE_VIEW_ACCESSIBILITY_FOCUSED://View��ȡ������
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
            Log.d("AnalysisAppsEvent","text:" + txt);//�����ǰ�¼��������ı���Ϣ
        }

        Log.d("AnalysisAppsEvent","-------------------------------------------------------------");
	}

	@Override
	public void onInterrupt() {
		// TODO Auto-generated method stub

	}

}
