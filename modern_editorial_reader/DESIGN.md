---
name: Modern Editorial Reader
colors:
  surface: '#f7f9fb'
  surface-dim: '#d8dadc'
  surface-bright: '#f7f9fb'
  surface-container-lowest: '#ffffff'
  surface-container-low: '#f2f4f6'
  surface-container: '#eceef0'
  surface-container-high: '#e6e8ea'
  surface-container-highest: '#e0e3e5'
  on-surface: '#191c1e'
  on-surface-variant: '#45474c'
  inverse-surface: '#2d3133'
  inverse-on-surface: '#eff1f3'
  outline: '#75777d'
  outline-variant: '#c5c6cd'
  surface-tint: '#545f73'
  primary: '#091426'
  on-primary: '#ffffff'
  primary-container: '#1e293b'
  on-primary-container: '#8590a6'
  inverse-primary: '#bcc7de'
  secondary: '#4b41e1'
  on-secondary: '#ffffff'
  secondary-container: '#645efb'
  on-secondary-container: '#fffbff'
  tertiary: '#00190e'
  on-tertiary: '#ffffff'
  tertiary-container: '#00301e'
  on-tertiary-container: '#00a472'
  error: '#ba1a1a'
  on-error: '#ffffff'
  error-container: '#ffdad6'
  on-error-container: '#93000a'
  primary-fixed: '#d8e3fb'
  primary-fixed-dim: '#bcc7de'
  on-primary-fixed: '#111c2d'
  on-primary-fixed-variant: '#3c475a'
  secondary-fixed: '#e2dfff'
  secondary-fixed-dim: '#c3c0ff'
  on-secondary-fixed: '#0f0069'
  on-secondary-fixed-variant: '#3323cc'
  tertiary-fixed: '#6ffbbe'
  tertiary-fixed-dim: '#4edea3'
  on-tertiary-fixed: '#002113'
  on-tertiary-fixed-variant: '#005236'
  background: '#f7f9fb'
  on-background: '#191c1e'
  surface-variant: '#e0e3e5'
typography:
  display-lg:
    fontFamily: Manrope
    fontSize: 36px
    fontWeight: '700'
    lineHeight: 44px
    letterSpacing: -0.02em
  headline-lg:
    fontFamily: Manrope
    fontSize: 28px
    fontWeight: '700'
    lineHeight: 36px
    letterSpacing: -0.015em
  headline-lg-mobile:
    fontFamily: Manrope
    fontSize: 24px
    fontWeight: '700'
    lineHeight: 32px
    letterSpacing: -0.01em
  headline-md:
    fontFamily: Manrope
    fontSize: 20px
    fontWeight: '600'
    lineHeight: 28px
    letterSpacing: -0.01em
  title-md:
    fontFamily: Manrope
    fontSize: 16px
    fontWeight: '600'
    lineHeight: 24px
    letterSpacing: 0em
  body-lg:
    fontFamily: Inter
    fontSize: 16px
    fontWeight: '400'
    lineHeight: 26px
    letterSpacing: -0.005em
  body-md:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '400'
    lineHeight: 22px
    letterSpacing: 0em
  body-sm:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '400'
    lineHeight: 18px
    letterSpacing: 0.01em
  label-lg:
    fontFamily: Inter
    fontSize: 14px
    fontWeight: '600'
    lineHeight: 20px
    letterSpacing: 0.01em
  label-md:
    fontFamily: Inter
    fontSize: 12px
    fontWeight: '500'
    lineHeight: 16px
    letterSpacing: 0.02em
  label-sm:
    fontFamily: Inter
    fontSize: 10px
    fontWeight: '600'
    lineHeight: 14px
    letterSpacing: 0.04em
rounded:
  sm: 0.25rem
  DEFAULT: 0.5rem
  md: 0.75rem
  lg: 1rem
  xl: 1.5rem
  full: 9999px
spacing:
  space-2xs: 0.25rem
  space-xs: 0.5rem
  space-sm: 0.75rem
  space-md: 1rem
  space-lg: 1.25rem
  space-xl: 1.5rem
  space-2xl: 2rem
  space-3xl: 2.5rem
  screen-margin-mobile: 1rem
  screen-margin-tablet: 1.5rem
  bottom-nav-height: 4.5rem
  card-padding: 1rem
---

## Brand & Style

This design system establishes an intimate, distraction-free sanctuary for literary focus and reading progression. Merging the systematic rigor of Jetpack Compose Material 3 with the tactile elegance of physical editorial publishing, it balances utility and serenity. 

The aesthetic is Modern Clean with tactile editorial touches:
- **Atmosphere:** Calm, deliberate, academic yet warmly accessible. It removes visual noise to center book cover art, typographic rhythm, and quantitative progress metrics.
- **Form Language:** Structured container cards, subtle interior hairlines, and intentional elevation layers mirroring pristine physical paper stock resting on a warm writing desk.
- **Emotional Intent:** To evoke the satisfaction of finishing a physical chapter while giving users immediate, effortless control over their reading goals and reading sessions.

## Colors

The palette grounds the application in deep, ink-inspired slates and warm, paper-like neutrals, punctuated by purposeful functional accents:

- **Primary (`#1E293B` - Deep Ink Slate):** Drives authoritative structural framing, primary action states, dominant icon fills, and top-level typography.
- **Secondary (`#4F46E5` - Soft Indigo/Violet):** Reserved for interactive focal points, selected states, active tab indicators, book tags, and contextual highlights.
- **Tertiary (`#10B981` - Mint Green Progress):** Exclusively dedicated to positive progression, completion streaks, page counts, velocity badges, and interactive progress bars.
- **Neutral Surface Canvas (`#F8FAFC` to `#F1F5F9`):** A warm, parchment-tinted gray background that softens eye strain during extended night or day reading sessions compared to pure stark white.

### Functional Roles & Contrast Rules
- **Surface Layer 0 (Canvas):** `#F8FAFC`
- **Surface Layer 1 (Card / Container):** `#FFFFFF`
- **Surface Layer 2 (Elevated Sheets / Menus):** `#FFFFFF`
- **Surface Variant (Subtle Inputs & Chips):** `#F1F5F9`
- **Border Subtle (Hairline Dividers):** `#E2E8F0`
- **Text Primary:** `#0F172A` (15.8:1 contrast on surface)
- **Text Secondary / Metadata:** `#64748B` (4.6:1 contrast on surface)

## Typography

The type system blends the architectural, geometric poise of **Manrope** for titles and book metrics with the optical neutrality of **Inter** for dense reading logs, notes, and navigational metadata.

### Typographic Rules
- **Headlines & Metric Figures:** Render book titles, percentage completions, and daily counters in `Manrope` with tighter tracking (`-0.01em` to `-0.02em`) to maintain an editorial finish.
- **Reading Passages & Notes:** Render long-form excerpts, quotes, and user reflections in `body-lg` using `Inter` with generous line-height (`26px`) to ensure prolonged legibility.
- **Tabular Numerics:** Enable `font-feature-settings: "tnum"` across all timers, page counts, and ISBN displays to prevent layout shifts during live session tracking.

## Layout & Spacing

The layout utilizes an 8pt-based fluid columnar system, adhering to Jetpack Compose Material 3 window size classes (Compact, Medium, Expanded).

### Form Factors & Adaptation
- **Mobile (Compact: < 600dp):** 4-column fluid layout with `16px` screen margins and `12px` gutters. Floating components conform to bottom thumb-reach zones. The bottom navigation bar spans the entire screen width with `safe-drawing-padding` accounted for below.
- **Tablet (Medium: 600dp - 839dp):** 8-column layout with `24px` margins and `16px` gutters. The bottom navigation bar shifts into a persistent compact vertical Navigation Rail anchored to the start edge.
- **Split View Reflow:** For book details and active reading timers, tablet layouts transition to an asymmetric dual-pane model (40% book overview and controls, 60% session analytics and journal).

## Elevation & Depth

This system avoids heavy drop shadows, opting for **crisp composite elevation**: combining micro-tonal shifts, slate hairline borders, and ultra-diffused ambient light.

- **Level 0 (Canvas):** Pure `#F8FAFC` flat surface. No elevation.
- **Level 1 (Cards, Book Modules, List Tiles):** Surface `#FFFFFF`, bounded by a `1px` border of `#E2E8F0`, accompanied by a resting shadow: `0px 1px 3px rgba(15, 23, 42, 0.04), 0px 1px 2px rgba(15, 23, 42, 0.02)`.
- **Level 2 (Active/Pressed Cards, Floating Chips):** Surface `#FFFFFF`, border `#CBD5E1`, elevated shadow: `0px 4px 6px -1px rgba(15, 23, 42, 0.07), 0px 2px 4px -2px rgba(15, 23, 42, 0.05)`.
- **Level 3 (Bottom Sheets, Modal Dialogs):** Surface `#FFFFFF`, shadow: `0px 10px 15px -3px rgba(15, 23, 42, 0.08), 0px 4px 6px -4px rgba(15, 23, 42, 0.04)`.
- **Navigation Bar Elevation:** Fixed `#FFFFFF` surface with a top hairline divider (`1px solid #E2E8F0`) and an upward ambient glow: `0px -4px 12px rgba(15, 23, 42, 0.03)`.

## Shapes

The design system employs a **Rounded** (Level 2) shape philosophy, balancing structured Android container discipline with soft, approachable corners reminiscent of bound paper volumes:

- **Base Controls & Inputs (`rounded-md`):** `8px` (`0.5rem`) for text fields, buttons, search bars, and progress track caps.
- **Cards & Content Blocks (`rounded-lg`):** `16px` (`1rem`) for book overview cards, goal widgets, and quote callouts.
- **Sheets & Large Overlays (`rounded-xl`):** `24px` (`1.5rem`) for bottom sheet modal top corners and featured hero banners.
- **Indicator Elements (`rounded-full`):** Pill-shaped (`9999px`) for progress bars, filter chips, category tags, and bottom navigation selection indicators.

## Components

### Buttons
- **Primary:** Filled `#1E293B` container, `#FFFFFF` text (`label-lg`), `8px` corner radius, `48px` minimum touch target height. Subtle active press scale (`0.98`).
- **Secondary / Accent:** Filled `#EEF2FF` container with `#4F46E5` text. Used for secondary reading actions (e.g., "Log Page", "Add Note").
- **Outlined:** `1px` border of `#E2E8F0`, `#0F172A` text, transparent background.

### Reading Progress Indicators
- **Linear Track:** `8px` track height, background `#E2E8F0`, foreground fill `#10B981` with rounded pill endpoints.
- **Metric Badges:** Inline pills with `#ECFDF5` background, `#047857` label (`label-sm`), and a trailing check or streak counter.

### Cards
- **Book Item Card:** `#FFFFFF` background, `1px solid #E2E8F0`, `16px` border radius, `16px` internal padding. Book cover uses a fixed `2:3` aspect ratio with an inner subtle border (`rgba(0,0,0,0.06)`) and `6px` radius. Content block houses title (`title-md`), author (`body-sm`), and the linear progress indicator.

### Input Fields
- **Container:** `#F1F5F9` background, `1px solid transparent` resting state, transitioning to `1px solid #4F46E5` on focus. Height `52px` with integrated leading icon (e.g., search magnifier) in `#64748B`. Placeholder text in `#94A3B8`.

### Chips & Filter Tabs
- **Filter Chips:** Height `32px`, pill-shaped (`rounded-full`). Unselected: `#F1F5F9` background, `#475569` text. Selected: `#1E293B` background, `#FFFFFF` text.

### Checkboxes & Radio Buttons
- **Checkbox:** `20px` square with `4px` corner radius. Checked: `#1E293B` fill with `#FFFFFF` check icon. Unchecked: `1.5px` stroke of `#94A3B8`.
- **Radio Button:** `20px` outer circle. Selected: `#4F46E5` outer ring with an internal concentric `8px` dot.

### Bottom Navigation Bar
- **Bar Container:** `72px` height (`bottom-nav-height`), background `#FFFFFF`, anchored border-top `1px solid #E2E8F0`.
- **Destination Item:** Centered vertical stack of icon and `label-sm`.
- **Selected State Indicator:** Active tab features an indigo/violet-tinted pill capsule (`#EEF2FF`) measuring `64px` wide by `32px` high behind the `#4F46E5` icon, with `#1E293B` bolded typography below.