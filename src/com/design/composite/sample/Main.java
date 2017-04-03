package com.design.composite.sample;

public class Main {

	public static void main(String[] args) {
		
		FrameLayout decorView = new FrameLayout("DecorView");
		
		LinearLayout linearLayout = new LinearLayout("LeftLinearLayout");
		RelativeLayout relativeLayout = new RelativeLayout("RightRelativeLayout");
		
		decorView.addView(linearLayout);
		decorView.addView(relativeLayout);
		
		TextView textView1 = new TextView("TextView1");
		TextView textView2 = new TextView("TextView2");
		EditTextView editTextView1 = new EditTextView("EditTextView1");
		EditTextView editTextView2 = new EditTextView("EditTextView2");
		
		linearLayout.addView(textView1);
		linearLayout.addView(editTextView1);
		
		relativeLayout.addView(textView2);
		relativeLayout.addView(editTextView2);
		
		decorView.requestLayout();
		
	}

}
