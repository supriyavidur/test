package md5e7b4fc76a2992c04bac1f1ae2c6602b6;


public class HindiTextView
	extends android.widget.TextView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("HindiTextView, Gurukul MVP", HindiTextView.class, __md_methods);
	}


	public HindiTextView (android.content.Context p0)
	{
		super (p0);
		if (getClass () == HindiTextView.class)
			mono.android.TypeManager.Activate ("HindiTextView, Gurukul MVP", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public HindiTextView (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == HindiTextView.class)
			mono.android.TypeManager.Activate ("HindiTextView, Gurukul MVP", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public HindiTextView (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == HindiTextView.class)
			mono.android.TypeManager.Activate ("HindiTextView, Gurukul MVP", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public HindiTextView (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == HindiTextView.class)
			mono.android.TypeManager.Activate ("HindiTextView, Gurukul MVP", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
