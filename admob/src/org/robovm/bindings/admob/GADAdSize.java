
package org.robovm.bindings.admob;

import org.robovm.apple.coregraphics.CGSize;
import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.Bridge;
import org.robovm.rt.bro.annotation.ByVal;
import org.robovm.rt.bro.annotation.GlobalValue;
import org.robovm.rt.bro.annotation.MachineSizedFloat;
import org.robovm.rt.bro.annotation.StructMember;

/** A valid GADAdSize is considered to be one of the predefined GADAdSize constants or a GADAdSize constructed by
 * GADAdSizeFromCGSize, GADAdSizeFullWidthPortraitWithHeight, GADAdSizeFullWidthLandscapeWithHeight.
 * 
 * Do not create a GADAdSize manually. Use one of the kGADAdSize constants. Treat GADAdSize as an opaque type. Do not access any
 * fields directly. To obtain a concrete CGSize, use the function CGSizeFromGADAdSize(). */
public final class GADAdSize extends Struct<GADAdSize> {
	private GADAdSize () {
	}

	@StructMember(0)
	public native @ByVal
	CGSize size ();

	@StructMember(0)
	public native GADAdSize size (@ByVal CGSize size);

	@StructMember(1)
	public native int flags ();

	@StructMember(1)
	public native GADAdSize flags (int flags);

	/** @return iPhone and iPod Touch ad size. Typically 320x50. */
	@GlobalValue(symbol = "kGADAdSizeBanner")
	public static native @ByVal
	GADAdSize banner ();

	/** @return Medium Rectangle size for the iPad (especially in a UISplitView's left pane). Typically 300x250. */
	@GlobalValue(symbol = "kGADAdSizeMediumRectangle")
	public static native @ByVal
	GADAdSize mediumRectangle ();

	/** @return Full Banner size for the iPad (especially in a UIPopoverController or in UIModalPresentationFormSheet). Typically
	 *         468x60. */
	@GlobalValue(symbol = "kGADAdSizeFullBanner")
	public static native @ByVal
	GADAdSize fullBanner ();

	/** @return Leaderboard size for the iPad. Typically 728x90. */
	@GlobalValue(symbol = "kGADAdSizeLeaderboard")
	public static native @ByVal
	GADAdSize leaderboard ();

	/** @return Skyscraper size for the iPad. Mediation only. AdMob/Google does not offer this size. Typically 120x600. */
	@GlobalValue(symbol = "kGADAdSizeSkyscraper")
	public static native @ByVal
	GADAdSize skyscraper ();

	/** @return An ad size that spans the full width of the application in portrait orientation. The height is typically 50 pixels on
	 *         an iPhone/iPod UI, and 90 pixels tall on an iPad UI. */
	@GlobalValue(symbol = "kGADAdSizeSmartBannerPortrait")
	public static native @ByVal
	GADAdSize smartBannerPortrait ();

	/** @return An ad size that spans the full width of the application in landscape orientation. The height is typically 32 pixels
	 *         on an iPhone/iPod UI, and 90 pixels tall on an iPad UI. */
	@GlobalValue(symbol = "kGADAdSizeSmartBannerLandscape")
	public static native @ByVal
	GADAdSize smartBannerLandscape ();

	/** @return Invalid ad size marker. */
	@GlobalValue(symbol = "kGADAdSizeInvalid")
	public static native @ByVal
	GADAdSize invalid ();

	/** Given a CGSize, return a custom GADAdSize. Use this only if you require a non-standard size, otherwise, use one of the
	 * standard size constants above.
	 * @param size
	 * @return */
	public GADAdSize getGADAdSize (CGSize size) {
		return getGADAdSize(this, size);
	}

	@Bridge(symbol = "GADAdSizeFromCGSize")
	protected static native GADAdSize getGADAdSize (@ByVal GADAdSize thiz, @ByVal CGSize size);

	/** Get a custom GADAdSize that spans the full width of the application in portrait orientation with the height provided.
	 * @param height
	 * @return */
	public GADAdSize getFullWidthPortrait (float height) {
		return getFullWidthPortrait(this, height);
	}

	@Bridge(symbol = "GADAdSizeFullWidthPortraitWithHeight")
	protected static native GADAdSize getFullWidthPortrait (@ByVal GADAdSize thiz, @MachineSizedFloat double height);

	/** Get a custom GADAdSize that spans the full width of the application in landscape orientation with the height provided.
	 * @param height
	 * @return */
	public GADAdSize getFullWidthLandscape (float height) {
		return getFullWidthLandscape(this, height);
	}

	@Bridge(symbol = "GADAdSizeFullWidthLandscapeWithHeight")
	protected static native GADAdSize getFullWidthLandscape (@ByVal GADAdSize thiz, @MachineSizedFloat double height);

	@Override
	public boolean equals (Object obj) {
		return obj instanceof GADAdSize && equals(this, (GADAdSize)obj);
	}

	@Bridge(symbol = "GADAdSizeEqualToSize")
	protected static native boolean equals (@ByVal GADAdSize thiz, @ByVal GADAdSize other);

	/** Given a GADAdSize constant, returns a CGSize. If the GADAdSize is unknown, returns CGSizeZero.
	 * @param size
	 * @return */
	public CGSize getCGSize (GADAdSize size) {
		return getCGSize(this, size);
	}

	@Bridge(symbol = "CGSizeFromGADAdSize")
	protected static native CGSize getCGSize (@ByVal GADAdSize thiz, @ByVal GADAdSize size);

	/** @return {@code true} if size is one of the predefined constants or is a custom GADAdSize generated by GADAdSizeFromCGSize. */
	public boolean isValid () {
		return isValid(this);
	}

	@Bridge(symbol = "IsGADAdSizeValid")
	protected static native boolean isValid (@ByVal GADAdSize thiz);

	/** @return Given a GADAdSize constant, returns a NSString describing the GADAdSize. */
	public String getString () {
		return getString(this);
	}

	@Bridge(symbol = "NSStringFromGADAdSize")
	protected static native String getString (@ByVal GADAdSize thiz);
}
