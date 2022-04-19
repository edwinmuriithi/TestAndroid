
package com.moringaschool.android_ip_1.Models.SearchEndPoint;

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
public class Title$$Parcelable
    implements Parcelable, ParcelWrapper<com.moringaschool.android_ip_1.Models.SearchEndPoint.Title>
{

    private com.moringaschool.android_ip_1.Models.SearchEndPoint.Title title$$0;
    @SuppressWarnings("UnusedDeclaration")
    public final static Creator<Title$$Parcelable>CREATOR = new Creator<Title$$Parcelable>() {


        @Override
        public Title$$Parcelable createFromParcel(android.os.Parcel parcel$$2) {
            return new Title$$Parcelable(read(parcel$$2, new IdentityCollection()));
        }

        @Override
        public Title$$Parcelable[] newArray(int size) {
            return new Title$$Parcelable[size] ;
        }

    }
    ;

    public Title$$Parcelable(com.moringaschool.android_ip_1.Models.SearchEndPoint.Title title$$2) {
        title$$0 = title$$2;
    }

    @Override
    public void writeToParcel(android.os.Parcel parcel$$0, int flags) {
        write(title$$0, parcel$$0, flags, new IdentityCollection());
    }

    public static void write(com.moringaschool.android_ip_1.Models.SearchEndPoint.Title title$$1, android.os.Parcel parcel$$1, int flags$$0, IdentityCollection identityMap$$0) {
        int identity$$0 = identityMap$$0 .getKey(title$$1);
        if (identity$$0 != -1) {
            parcel$$1 .writeInt(identity$$0);
        } else {
            parcel$$1 .writeInt(identityMap$$0 .put(title$$1));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.SearchEndPoint.Title.class, title$$1, "image"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.SearchEndPoint.Title.class, title$$1, "id"));
            parcel$$1 .writeString(InjectionUtil.getField(java.lang.String.class, com.moringaschool.android_ip_1.Models.SearchEndPoint.Title.class, title$$1, "title"));
        }
    }

    @Override
    public int describeContents() {
        return  0;
    }

    @Override
    public com.moringaschool.android_ip_1.Models.SearchEndPoint.Title getParcel() {
        return title$$0;
    }

    public static com.moringaschool.android_ip_1.Models.SearchEndPoint.Title read(android.os.Parcel parcel$$3, IdentityCollection identityMap$$1) {
        int identity$$1 = parcel$$3 .readInt();
        if (identityMap$$1 .containsKey(identity$$1)) {
            if (identityMap$$1 .isReserved(identity$$1)) {
                throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
            }
            return identityMap$$1 .get(identity$$1);
        } else {
            com.moringaschool.android_ip_1.Models.SearchEndPoint.Title title$$4;
            int reservation$$0 = identityMap$$1 .reserve();
            title$$4 = new com.moringaschool.android_ip_1.Models.SearchEndPoint.Title();
            identityMap$$1 .put(reservation$$0, title$$4);
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.SearchEndPoint.Title.class, title$$4, "image", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.SearchEndPoint.Title.class, title$$4, "id", parcel$$3 .readString());
            InjectionUtil.setField(com.moringaschool.android_ip_1.Models.SearchEndPoint.Title.class, title$$4, "title", parcel$$3 .readString());
            com.moringaschool.android_ip_1.Models.SearchEndPoint.Title title$$3 = title$$4;
            identityMap$$1 .put(identity$$1, title$$3);
            return title$$3;
        }
    }

}
