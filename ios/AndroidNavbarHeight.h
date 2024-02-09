
#ifdef RCT_NEW_ARCH_ENABLED
#import "RNAndroidNavbarHeightSpec.h"

@interface AndroidNavbarHeight : NSObject <NativeAndroidNavbarHeightSpec>
#else
#import <React/RCTBridgeModule.h>

@interface AndroidNavbarHeight : NSObject <RCTBridgeModule>
#endif

@end
