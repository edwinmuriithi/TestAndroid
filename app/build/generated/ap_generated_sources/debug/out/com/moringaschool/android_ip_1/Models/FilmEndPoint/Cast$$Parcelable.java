
package com.moringaschool.android_ip_1.Models.FilmEndPoint;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import org.parceler.Generated;
import org.parceler.IdentityCollection;
import org.parceler.InjectionUtil;
import org.parceler.ParcelWrapper;
import org.parceler.ParcelerRuntimeException;

@Generated("org.parceler.ParcelAnnotationProcessor")
@SuppressWarnings({
    "unchecked",
    "deprecation"
})
public class Cast$$Parcelable
    implements Parcelable, ParcelWrapper<com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast>
{

    private com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast cast$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Cast$$Parcelable>CREATOR = new Creator<Cast$$Parcelable>() {


        @Override
        public Cast$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Cast$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Cast$$Parcelable[] newArray(int size) {
            return new Cast$$Parcelable[size] ;
        }

    }
    ;

    public Cast$$Parcelable(com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast cast$$2) {
        cast$$0 = cast$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(cast$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast cast$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(cast$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(cast$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast.class, cast$$1, "actor"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast.class, cast$$1, "character"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast.class, cast$$1, "actorId"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast getParcel() {
        return cast$$0;
    }

    public static com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast cast$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            cast$$4 = new com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast();
            identityMap$$1 .put(reservation$$0, cast$$4);
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast.class, cast$$4, "actor", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast.class, cast$$4, "character", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast.class, cast$$4, "actorId", parcel$$3 .readString());
            com.moringaschool.android_ip_1.Models.FilmEndPoint.Cast cast$$3 = cast$$4;
            identityMap$$1 .put(identity$$1, cast$$3);
            return cast$$3;
        }
    }

}
